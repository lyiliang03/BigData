package com.yu.hadoop;

/**
 * Created by kevin on 2016/12/23.
 */

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.io.IOUtils;

public class UrlToHdfs {
    static{
        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
    }

    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        String urlStr = "hdfs://master:9000/home/hadoop/hadoop-2.6.5/data/fs/file2.txt" ;
=======
        String urlStr = "hdfs://master:9000/home/hadoop/hadoop-2.6.5/data/fs/file1.txt" ;
>>>>>>> github/master
        URL url = new URL(urlStr);
        InputStream is = url.openStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        IOUtils.copyBytes(is, baos, 1024);
        IOUtils.closeStream(is);
        System.out.println(new String(baos.toByteArray()));
    }

}
