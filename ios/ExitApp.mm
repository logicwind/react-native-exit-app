#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(ExitApp, NSObject)

RCT_EXTERN_METHOD(exitApp)

+ (BOOL)requiresMainQueueSetup
{
  return NO;
}

@end
