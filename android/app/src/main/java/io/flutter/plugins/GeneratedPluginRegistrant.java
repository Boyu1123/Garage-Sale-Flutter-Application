package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
    flutterEngine.getPlugins().add(new io.flutter.plugins.camera.CameraPlugin());
      io.flutter.plugins.firebase.cloudfirestore.CloudFirestorePlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.firebase.cloudfirestore.CloudFirestorePlugin"));
      io.flutter.plugins.firebaseauth.FirebaseAuthPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.firebaseauth.FirebaseAuthPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FirebaseCorePlugin());
      io.flutter.plugins.firebase.storage.FirebaseStoragePlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.firebase.storage.FirebaseStoragePlugin"));
      com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.registerWith(shimPluginRegistry.registrarFor("com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin"));
      io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin.registerWith(shimPluginRegistry.registrarFor("io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin"));
      io.flutter.plugins.imagepicker.ImagePickerPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.imagepicker.ImagePickerPlugin"));
      com.azihsoyn.flutter.mlkit.MlkitPlugin.registerWith(shimPluginRegistry.registrarFor("com.azihsoyn.flutter.mlkit.MlkitPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
  }
}