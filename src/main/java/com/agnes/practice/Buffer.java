package com.agnes.practice;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class Buffer {
    public static void main(String[] args) {
        exe1();
        exe2();
        exe3();
        exe4();
    }

    public static void exe1() {

        ByteBuffer buffer = ByteBuffer.allocate(5);
        buffer.put((byte) 100);
        buffer.put((byte) 101);
        buffer.put((byte) 102);
        buffer.flip();

        while (buffer.hasRemaining()) {
            byte c = buffer.get();
            System.out.println((char) c);
        }
    }

    /*Create an IntBuffer with capacity 3.

Put values: 10, 20, and 30.

Flip and print all values.

     */
    public static void exe2() {
        IntBuffer intBuffer = IntBuffer.allocate(3);
        intBuffer.put(10);
        intBuffer.put(20);
        intBuffer.put(30);
        intBuffer.flip();

        while (intBuffer.hasRemaining()) {
            int c = intBuffer.get();
            System.out.println(c);
        }

    }

    public static void exe3() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        byteBuffer.put((byte) 65);
        byteBuffer.put((byte) 66);
        byteBuffer.flip();

        byte b = byteBuffer.get();
        System.out.println((char) b);

        while (byteBuffer.hasRemaining()) {
            byte a = byteBuffer.get();
            System.out.println((char) a);

        }
    }

    public static void exe4() {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(5);
        byteBuffer1.put((byte) 90);
        byteBuffer1.put((byte) 91);
        byteBuffer1.flip();
        byte d = byteBuffer1.get();
        System.out.println((char) d);
        byteBuffer1.clear();
        byteBuffer1.rewind();
        byteBuffer1.put((byte)100);
        byteBuffer1.put((byte)101);
        byteBuffer1.put((byte)102);
        byteBuffer1.flip();

        while (byteBuffer1.hasRemaining()) {
            byte a = byteBuffer1.get();
            System.out.println((char) a);
        }

    }
}
