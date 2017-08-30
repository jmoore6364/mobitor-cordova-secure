module.exports = {
    isSecure: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "MobitorSecure", "isSecured", [null]);
    }
};