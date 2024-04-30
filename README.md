# fabric-language-clojure

Fabric language module for [Clojure](https://clojure.org/). _Adds support for Clojure exclusive entrypoints_ (**TODO**) and bundles the Clojure’s standard library.

## Usage

### Dependency

Add it as a dependency to your Gradle project:
(**TODO**)

### Adapter (TODO)

Use the `clojure` adapter for your mod by setting the `adapter` property in the `fabric.mod.json` file.
Remember to the add a dependency entry to your `fabric.mod.json` file:

```json
{
    "schemaVersion":  1, 
    "entrypoints": {
        "main": [
            {
                "adapter": "clojure",
                "value": "namespace/var"
            }
        ]
    },
    "depends": {
        "fabric-language-clojure": "*"
    }
}
```

For more info reference the [fabric.mod.json documentation](https://fabricmc.net/wiki/documentation:fabric_mod_json).

Do not forget to set the `schemaVersion` to `1` or it will fall back to schema `0` and will not attempt to load entrypoints.

### Entrypoint samples

<table>
<tr>
<th><i>Kind</i></th>
<th>Entrypoint definition</th>
<th>Code</th>
</tr>

<tr>
<td><code>Class reference</code></td>
<td>

```json
"mymod.MyMod"
```

or

```json
{
  "adapter": "clojure",
  "value": "mymod.MyMod"
}
```
(TODO)
</td>
<td>

```clojure
(ns mymod
    (:gen-class
      :name mymod.MyMod
      :implements [net.fabricmc.api.ModInitializer]))
(defn -onInitialize [_]) ; TODO
```
</td>

</tr>
<tr>
<td><code>Function reference (TODO)</code></td>
<td>

```json
{
    "adapter": "clojure",
    "value": "mymod/init"
}
```

</td>
<td>

```clojure
(ns mymod)
(defn init []) ; TODO
```

</td>
</tr>
</table>

## Bundled libraries

`org.clojure` namespace:
- **`clojure`** 1.11.3 [Docs](https://clojure.org/api/api), [Guide](https://clojure-doc.org/), [GitHub](https://github.com/clojure)

## Available Versions

TODO

## Updating README
TODO

- Update the readme in `templates/README.template.md`.
- Run `./gradlew processMDTemplates`.