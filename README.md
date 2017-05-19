# Mobitor Cordova Secure Plugin

> This plugin allows you to check if the device is secured either by pin, pattern, fingerprint, etc.

## Adding/Removing the Plugin
It will be saved to the config.xml file

```bash
cordova plugin (add|rm) mobitor-cordova-secure --save
```

or via npm (It will be saved to the package.json file)

```bash
npm (install|rm) mobitor-cordova-secure --save
```

## Using the plugin (opens Location Settings in Android and Application Settings in iOS)

```js
window.mobitor.secure.isSecure(function (success) {
    if (success) // returns true if device is secure
        // Do something
}, function (error) {
    // Handle error
});
```


## License
```
The MIT License

Copyright (c) 2017 Yuan Tao

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```
