package bftsmart.demo.delivery;

import java.io.ByteArrayOutputStream;

/**
 * Created by lijin on 2/24/19.
 */
public class JDeliver extends JSerializable {
    @Override
    public ByteArrayOutputStream generateOutputStream() {
        return super.generateOutputStream();
    }

    @Override
    public JDeliver recoverFromOutputStream(ByteArrayOutputStream stream) {
        return this;
    }
}
