# SpeechToTextUnityPlugin
<p>Text-to-Speech Android plugin for Unity. Utilzies built-in Android API.
No dialog pop-ups</p>

<p>Plugin class doesn't extend Activity, so it uses your Unity activity and doesn't overlap an activity or stop underlying activity. An activity/context needs to be passed in to use the plugin.</p>

<h2>How to use:</h2>
<ol>
<li>build the aar / jar yourself using this library
<li>Paste jar into Unity project folder under Plugins/Android
<li>In Unity script, instantiate object <code>AndroidJavaClass pluginClass = new AndroidJavaClass("com.example.sttunityplugin.TTSPlugin");</code> This object is entry point to the plugin
<li>Obtain Unity Activity <code>AndroidJavaClass unityPlayer = new AndroidJavaClass("com.unity3d.player.UnityPlayer");</code> then <code>AndroidJavaObject context = unityPlayer.GetStatic<AndroidJavaObject>("currentActivity");</code>
<li>Set context/Activity <code>pluginClass.CallStatic("setContext", context);</code>
<li>Call static sayMessage <code>pluginClass.CallStatic("sayMessage", "blablabla");</code>
<li>???
<li>Profit
</ol>

<h2>Reason WHY I built this</h2>
<p>For ARCore. Needed a plugin that doesn't open shitty Google dialog pop-up or any other activity that interrupts ARCore activity</p>
