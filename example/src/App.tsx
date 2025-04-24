import { Button, StyleSheet, View } from 'react-native';
import { exitApp } from '@logicwind/react-native-exit-app';

export default function App() {
  return (
    <View style={styles.container}>
      <Button title="Exit App" onPress={() => exitApp()} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
