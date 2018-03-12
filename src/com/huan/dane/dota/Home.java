package com.huan.dane.dota;

public class Home extends Building {

    private static Home mInstance;

    private Home() {
        this.image = DotaGame.home;
        // 压缩图片
        this.width = 50;
        this.height = 50;
        this.x = 10;
        this.y = DotaGame.mHeight - height - 10;
    }

    public static Home newInstance() {
        if (mInstance == null) {
            mInstance = new Home();
        }
        return mInstance;
    }
}