![](images/1.jpg)
![](images/2.jpg)
# library introduce
* A very simple and easy to use qr code style generation library
* Free combination of qr code style

# Use example

* Set the space of the outer circle of the logo
```java
        Bitmap logo = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        ImageView logo_iv = (ImageView) findViewById(R.id.logo_circle_space_iv);
        Bitmap targetBitmap = QRCodeStyle.Builder.builder()
                .setQr(BitmapFactory.decodeResource(getResources(), R.mipmap.qr))
                .setLogo(logo)
                .setCircle(true)
                .setSpace(5)
                .build().get();
        logo_iv.setImageBitmap(targetBitmap);
```
* Set Mask
```java
        Bitmap mask = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        ImageView logo_iv = (ImageView) findViewById(R.id.mask_iv);
        Bitmap targetBitmap = QRCodeStyle.Builder.builder()
                .setQr(BitmapFactory.decodeResource(getResources(), R.mipmap.qr))
                .setMask(mask)
                .build().get();
        logo_iv.setImageBitmap(targetBitmap);
```
* Set Bg
```java
        Bitmap bg = BitmapFactory.decodeResource(getResources(), R.mipmap.bg);
        ImageView logo_iv = (ImageView) findViewById(R.id.bg_iv);
        Bitmap targetBitmap = QRCodeStyle.Builder.builder()
                .setQr(BitmapFactory.decodeResource(getResources(), R.mipmap.qr))
                .setBg(bg)
                .build().get();
        logo_iv.setImageBitmap(targetBitmap);
```

* All examples are shown in [MainActivity](https://github.com/wu928320442/QRCodeStyle/blob/master/app/src/main/java/com/wjj/easy/qrcodestyleHelper/MainActivity.java), for reference

# Import library use Gradle
```gradle
compile 'com.wjj.easy:qrcodestyle:1.0.0'
```
# About author
* **QQ** 928320442
* **Email**wujiajun311@gmail.com