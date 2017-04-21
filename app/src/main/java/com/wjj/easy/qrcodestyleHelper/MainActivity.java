package com.wjj.easy.qrcodestyleHelper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.wjj.easy.qrcodestyle.QRCodeStyle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo();
        logoWithZoom();
        logoWithCircle();
        logoWithCircleAndSpace();
        mask();
        bg();
    }

    private void logo() {
        ImageView logo_iv = (ImageView) findViewById(R.id.logo_iv);
        Bitmap targetBitmap = QRCodeStyle.Builder.builder()
                .setQr(BitmapFactory.decodeResource(getResources(), R.mipmap.qr))
                .setLogo(BitmapFactory.decodeResource(getResources(), R.mipmap.logo))
                .build().get();
        logo_iv.setImageBitmap(targetBitmap);
    }

    private void logoWithZoom() {
        Bitmap logo = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        ImageView logo_iv = (ImageView) findViewById(R.id.logo_zoom_iv);
        Bitmap targetBitmap = QRCodeStyle.Builder.builder()
                .setQr(BitmapFactory.decodeResource(getResources(), R.mipmap.qr))
                .setLogo(logo)
                .setRadius(100)
                .build().get();
        logo_iv.setImageBitmap(targetBitmap);
    }

    private void logoWithCircle() {
        Bitmap logo = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        ImageView logo_iv = (ImageView) findViewById(R.id.logo_circle_iv);
        Bitmap targetBitmap = QRCodeStyle.Builder.builder()
                .setQr(BitmapFactory.decodeResource(getResources(), R.mipmap.qr))
                .setLogo(logo)
                .setCircle(true)
                .build().get();
        logo_iv.setImageBitmap(targetBitmap);
    }

    private void logoWithCircleAndSpace() {
        Bitmap logo = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        ImageView logo_iv = (ImageView) findViewById(R.id.logo_circle_space_iv);
        Bitmap targetBitmap = QRCodeStyle.Builder.builder()
                .setQr(BitmapFactory.decodeResource(getResources(), R.mipmap.qr))
                .setLogo(logo)
                .setCircle(true)
                .setSpace(5)
                .build().get();
        logo_iv.setImageBitmap(targetBitmap);
    }

    private void mask() {
        Bitmap mask = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        ImageView logo_iv = (ImageView) findViewById(R.id.mask_iv);
        Bitmap targetBitmap = QRCodeStyle.Builder.builder()
                .setQr(BitmapFactory.decodeResource(getResources(), R.mipmap.qr))
                .setMask(mask)
                .build().get();
        logo_iv.setImageBitmap(targetBitmap);
    }

    private void bg() {
        Bitmap bg = BitmapFactory.decodeResource(getResources(), R.mipmap.bg);
        ImageView logo_iv = (ImageView) findViewById(R.id.bg_iv);
        Bitmap targetBitmap = QRCodeStyle.Builder.builder()
                .setQr(BitmapFactory.decodeResource(getResources(), R.mipmap.qr))
                .setBg(bg)
                .build().get();
        logo_iv.setImageBitmap(targetBitmap);
    }
}
