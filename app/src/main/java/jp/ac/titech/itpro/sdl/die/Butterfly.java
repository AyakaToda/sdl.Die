package jp.ac.titech.itpro.sdl.die;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Butterfly implements Obj {
    private final static float[] VERTICES = {
            //left top
            // left
            -1, -0.2f, 0.9f,
            -1, 1, 0.9f,
            -1, -0.2f, 1,
            -1, 1, 1,
            // bottom
            -1, -0.2f, 0.9f,
            0, 0, 0,
            -1, -0.2f, 1,
            // top
            -1, 1, 0.9f,
            0, 0, 0,
            -1, 1, 1,
            // back
            -1, -0.2f, 0.9f,
            0, 0, 0,
            -1, 1, 0.9f,
            // front
            -1, -0.2f, 1,
            0, 0, 0,
            -1, 1, 1,

            //left bottom
            // left
            -1, -1, 0.9f,
            -1, -0.4f, 0.9f,
            -1, -1, 1,
            -1, -0.4f, 1,
            // bottom
            -1, -1, 0.9f,
            0, 0, 0,
            -1, -1, 1,
            // top
            -1, -0.4f, 0.9f,
            0, 0, 0,
            -1, -0.4f, 1,
            // back
            -1, -1, 0.9f,
            0, 0, 0,
            -1, -0.4f, 0.9f,
            // front
            -1, -1, 1,
            0, 0, 0,
            -1, -0.4f, 1,

            //right top
            //right
            1, -0.2f, 0.9f,
            1, 1, 0.9f,
            1, -0.2f, 1,
            1, 1, 1,
            // bottom
            1, -0.2f, 0.9f,
            0, 0, 0,
            1, -0.2f, 1,
            // top
            1, 1, 0.9f,
            0, 0, 0,
            1, 1, 1,
            // back
            1, -0.2f, 0.9f,
            0, 0, 0,
            1, 1, 0.9f,
            // front
            1, -0.2f, 1,
            0, 0, 0,
            1, 1, 1,

            //right bottom
            //right
            1, -1, 0.9f,
            1, -0.4f, 0.9f,
            1, -1, 1,
            1, -0.4f, 1,
            // bottom
            1, -1, 0.9f,
            0, 0, 0,
            1, -1, 1,
            // top
            1, -0.4f, 0.9f,
            0, 0, 0,
            1, -0.4f, 1,
            // back
            1, -1, 0.9f,
            0, 0, 0,
            1, -0.4f, 0.9f,
            // front
            1, -1, 1,
            0, 0, 0,
            1, -0.4f, 1
    };

    private final FloatBuffer vbuf;

    Butterfly() {
        vbuf = ByteBuffer
                .allocateDirect(VERTICES.length * 4)
                .order(ByteOrder.nativeOrder())
                .asFloatBuffer();
        vbuf.put(VERTICES);
        vbuf.position(0);
    }

    public void draw(GL10 gl) {
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vbuf);

        // left top
        gl.glNormal3f(-1, 0, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 0, 4);
        // bottom
        gl.glNormal3f(1, -1, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 4, 3);
        // top
        gl.glNormal3f(1, 1, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 7, 3);
        // back
        gl.glNormal3f(-9, 0, -10);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 10, 3);
        // front
        gl.glNormal3f(0, 1, 1);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 13, 3);

        // left bottom
        gl.glNormal3f(-1, 0, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 16, 4);
        // bottom
        gl.glNormal3f(1, -1, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 20, 3);
        // top
        gl.glNormal3f(1, 1, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 23, 3);
        // back
        gl.glNormal3f(-9, 0, -10);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 26, 3);
        // front
        gl.glNormal3f(0, 1, 1);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 29, 3);

        // right top
        gl.glNormal3f(1, 0, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 32, 4);
        // bottom
        gl.glNormal3f(-1, -1, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 36, 3);
        // top
        gl.glNormal3f(-1, 1, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 39, 3);
        // back
        gl.glNormal3f(9, 0, -10);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 42, 3);
        // front
        gl.glNormal3f(-1, 1, 1);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 45, 3);

        // right bottom
        gl.glNormal3f(1, 0, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 48, 4);
        // bottom
        gl.glNormal3f(-1, -1, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 52, 3);
        // top
        gl.glNormal3f(-1, 1, 0);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 55, 3);
        // back
        gl.glNormal3f(9, 0, -10);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 58, 3);
        // front
        gl.glNormal3f(-1, 1, 1);
        gl.glDrawArrays(GL10.GL_TRIANGLES, 61, 3);
    }
}
