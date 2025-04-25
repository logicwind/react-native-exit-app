# @logicwind/react-native-exit-app

`@logicwind/react-native-exit-app` is a simple React Native library that allows you to programmatically exit or close your app. It's useful for scenarios where you want to force the app to close, such as after a logout, session timeout, or a critical error. The library supports both Android and iOS as well as TvOS.

## Installation

Using npm:

```sh md title="Terminal"
npm install @logicwind/react-native-exit-app
```

or using yarn:

```sh md title="Terminal"
yarn add @logicwind/react-native-exit-app
```

### iOS Setup

After installation, make sure to install CocoaPods:

```sh md title="Terminal"
cd ios && pod install
```

### Android Setup

No additional setup is required.

## Usage

Import and use the `exitApp` function.

```tsx md title="App.tsx"
import { exitApp } from '@logicwind/react-native-exit-app';

<Button title="Exit App" onPress={() => exitApp()} />;
```

## How It Works

`@logicwind/react-native-exit-app` uses native code to exit the app based on the platform:

- **iOS:** The module uses exit(0) to force the app to close.
- **Android:** The module calls System.exit(0) or finishes the activity to terminate the app.

## react-native-exit-app is crafted mindfully at [Logicwind](https://www.logicwind.com?utm_source=github&utm_medium=github.com-logicwind&utm_campaign=react-native-exit-app)

We are a 130+ people company developing and designing multiplatform applications using the Lean & Agile methodology. To get more information on the solutions that would suit your needs, feel free to get in touch by [email](mailto:sales@logicwind.com) or through or [contact form](https://www.logicwind.com/book-call?utm_source=github&utm_medium=github.com-logicwind&utm_campaign=react-native-exit-app)!

We will always answer you with pleasure 😁

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
