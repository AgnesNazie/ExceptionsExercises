package com.agnes.practice;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Channel {
    public static void main(String[] args) {
        exe2();
    }

    public static void exe1() {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            FileChannel channel = fos.getChannel();
            String message = "Java NIO is powerful!";
            ByteBuffer buffered = ByteBuffer.allocate(100);
            buffered.put(message.getBytes());

            buffered.flip();
            channel.write(buffered);
            channel.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void exe2() {
        try {
            FileInputStream fis = new FileInputStream("output.txt");
            FileChannel channel = fis.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(100);

            // TODO: Read from channel into buffer
            channel.read(buffer);

            // TODO: Prepare buffer to be read

            buffer.flip();

            // TODO: Print each character from the buffer

            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());

            }

            channel.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
