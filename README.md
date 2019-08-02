# ToastStyleable

<img src="https://github.com/Muddz/StyleableToast/blob/master/cases.png" width="75%">

```groovy
dependencies {
    implementation 'com.muddzdev:styleabletoast:2.2.2'   
}
```

```java
    StyleableToast.makeText(context, "Hello World!", Toast.LENGTH_LONG, R.style.mytoast).show();
```

```xml
    <style name="mytoast">
        <item name="stTextBold">true</item>
        <item name="stTextColor">#fff</item>
        <item name="stTextSize">14sp</item>
        <item name="stColorBackground">#fff</item>
        <item name="stSolidBackground">true</item>
        <item name="stStrokeWidth">3dp</item>
        <item name="stStrokeColor">#fff</item>
        <item name="stIconStart">@drawable/ic</item>
        <item name="stIconEnd">@drawable/ic</item>
        <item name="stLength">LONG</item> LONG or SHORT
        <item name="stGravity">top</item> top or center
        <item name="stRadius">5dp</item>
    </style>

```
