package com.baoyachi.spannablestringdemo;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showForegroundColorSpan();
        showBackgroundColorSpan();
        showRelativeSizeSpan();
        showStrikethroughSpan();
        showUnderlineSpan();
        showSuperscriptSpan();
        showSubscriptSpan();
        showStyleSpan();
        showImageSpan();
        showClickableSpan();
        showURLSpan();
    }

    /**
     * 设置文本前景色
     */
    private void showForegroundColorSpan()
    {
        TextView tvForegroundColorSpan = (TextView) findViewById(R.id.tv_foreground_color_span);
        SpannableString spannableString = new SpannableString("这是测试第一行文字的前景色");
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor("#FF8892"));
        spannableString.setSpan(colorSpan, 4, 9, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvForegroundColorSpan.setText(spannableString);
    }

    /**
     * 设置文本背景色
     */
    private void showBackgroundColorSpan()
    {
        TextView tvBackgroundColorSpan = (TextView) findViewById(R.id.tv_background_color_span);
        SpannableString spannableString = new SpannableString("这是测试第二行文字的背景色");
        BackgroundColorSpan colorSpan = new BackgroundColorSpan(Color.parseColor("#FF8892"));
        spannableString.setSpan(colorSpan, 4, 9, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvBackgroundColorSpan.setText(spannableString);
    }

    /**
     * 设置文字相对大小
     */
    private void showRelativeSizeSpan()
    {
        TextView tvRelativeSizeSpan = (TextView) findViewById(R.id.tv_relative_size_span);

        SpannableString spannableString = new SpannableString("这是测试第三行文字大小");

        RelativeSizeSpan sizeSpan0 = new RelativeSizeSpan(0.8f);
        RelativeSizeSpan sizeSpan1 = new RelativeSizeSpan(1.0f);
        RelativeSizeSpan sizeSpan2 = new RelativeSizeSpan(1.2f);
        RelativeSizeSpan sizeSpan3 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan sizeSpan4 = new RelativeSizeSpan(1.6f);
        RelativeSizeSpan sizeSpan5 = new RelativeSizeSpan(1.8f);
        RelativeSizeSpan sizeSpan6 = new RelativeSizeSpan(1.6f);
        RelativeSizeSpan sizeSpan7 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan sizeSpan8 = new RelativeSizeSpan(1.2f);
        RelativeSizeSpan sizeSpan9 = new RelativeSizeSpan(1.0f);
        RelativeSizeSpan sizeSpan10 = new RelativeSizeSpan(0.8f);
        spannableString.setSpan(sizeSpan0,0,1,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan1,1,2,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan2,2,3,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan3,3,4,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan4,4,5,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan5,5,6,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan6,6,7,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan7,7,8,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan8,8,9,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan9,9,10,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan10,10,11,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvRelativeSizeSpan.setText(spannableString);
    }

    /**
     * 设置中划线
     */
    private void showStrikethroughSpan()
    {
        TextView tvStrikethroughSpan = (TextView) findViewById(R.id.tv_strikethrough_span);
        SpannableString spannableString = new SpannableString("这是第四行设置中划线");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        spannableString.setSpan(strikethroughSpan,7,spannableString.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvStrikethroughSpan.setText(spannableString);
    }

    /**
     * 设置下划线
     */
    private void showUnderlineSpan()
    {
        TextView tvUnderLineSpan = (TextView) findViewById(R.id.tv_underline_span);
        SpannableString spannableString = new SpannableString("这是第五行设置下划线");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        spannableString.setSpan(underlineSpan,7,spannableString.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvUnderLineSpan.setText(spannableString);
    }

    /**
     * 设置上标
     */
    private void showSuperscriptSpan()
    {
        TextView tvSuperScriptSpan = (TextView) findViewById(R.id.tv_superscript_span);
        SpannableString spannableString = new SpannableString("这是第六行设置文字上标:X2");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        spannableString.setSpan(superscriptSpan,13,14,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvSuperScriptSpan.setText(spannableString);
    }

    /**
     * 设置文字下标
     */
    private void showSubscriptSpan()
    {
        TextView tvSubScriptSpan = (TextView) findViewById(R.id.tv_subscript_span);
        SpannableString spannableString = new SpannableString("这是第七行设置文字下标:CO2");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        spannableString.setSpan(subscriptSpan, spannableString.length()-1, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvSubScriptSpan.setText(spannableString);
    }

    /**
     * 设置文字字体
     */
    private void showStyleSpan()
    {
        TextView tvStyleSpan = (TextView) findViewById(R.id.tv_style_span);
        SpannableString spannableString = new SpannableString("这是第八行设置文字字体");
        StyleSpan styleSpanBold = new StyleSpan(Typeface.BOLD);//粗体
        StyleSpan styleSpanItalic = new StyleSpan(Typeface.ITALIC);//斜体
        spannableString.setSpan(styleSpanBold,2,4,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpanItalic,spannableString.length()-2,spannableString.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvStyleSpan.setText(spannableString);
    }

    /**
     * 设置文本图片
     */
    private void showImageSpan()
    {
        TextView tvImageSpan = (TextView) findViewById(R.id.tv_image_span);
        SpannableString spannableString = new SpannableString("这是第九行设置文字图片");
        Drawable drawable = ContextCompat.getDrawable(this,R.mipmap.ic_launcher);
        drawable.setBounds(0,0,42,42);
        ImageSpan imageSpan = new ImageSpan(drawable);
        spannableString.setSpan(imageSpan,9,11,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvImageSpan.setText(spannableString);
    }

    /**
     * 设置文字点击
     */
    private void showClickableSpan()
    {
        TextView tvClickableSpan = (TextView) findViewById(R.id.tv_clickable_span);
        SpannableString spannableString = new SpannableString("这是第十行设置文字点击");
        MyClickableSpan clickableSpan = new MyClickableSpan("http://www.baoyachi.com");
        spannableString.setSpan(clickableSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvClickableSpan.setMovementMethod(LinkMovementMethod.getInstance());
        tvClickableSpan.setHighlightColor(Color.parseColor("#36969696"));
        tvClickableSpan.setText(spannableString);
        tvClickableSpan.setText(spannableString);
    }


    class MyClickableSpan extends ClickableSpan {

        private String content;

        public MyClickableSpan(String content) {
            this.content = content;
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setUnderlineText(false);
        }

        @Override
        public void onClick(View widget) {
            Toast.makeText(getBaseContext(),content,Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * 设置超链接文本
     */
    private void showURLSpan()
    {
        TextView tvUrlSpan = (TextView) findViewById(R.id.tv_url_span);
        SpannableString spannableString = new SpannableString("这是第十一行设置文字超链接");
        URLSpan urlSpan = new URLSpan("http://www.baoyachi.com");
        spannableString.setSpan(urlSpan, 6, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tvUrlSpan.setMovementMethod(LinkMovementMethod.getInstance());
        tvUrlSpan.setHighlightColor(Color.parseColor("#ff8892"));
        tvUrlSpan.setText(spannableString);
    }



}

