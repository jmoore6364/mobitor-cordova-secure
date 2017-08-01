#import <Cordova/CDV.h>

@interface MobitorSecure : CDVPlugin

- (void) isScreenLockEnabled:(CDVInvokedUrlCommand*)command;
- (BOOL) isSecured:(CDVInvokedUrlCommand*)command;

@end
