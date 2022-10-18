package com.dustin.network;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Dustin_Peng
 * @Description URL
 * @create 2022-10-14-01:30
 */
public class URLTest1 {
    public static void main(String[] args) {
        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            URL url = new URL("http://localhost:8080/examples/IO1.png");
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();//获取连接
            is = urlConnection.getInputStream();
            fos = new FileOutputStream("is.png");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
                fos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(is);
            closeStream(fos);
            if (urlConnection != null)
                urlConnection.disconnect();
        }
    }

    public static void closeStream(Closeable s) {
        if (s != null) {
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
