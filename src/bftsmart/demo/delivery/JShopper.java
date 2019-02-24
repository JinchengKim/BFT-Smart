package bftsmart.demo.delivery;

import java.io.ByteArrayOutputStream;

/**
 * Created by lijin on 2/23/19.
 */
public class JShopper extends JSerializable{
    @Override
    public ByteArrayOutputStream generateOutputStream() {
        return super.generateOutputStream();
    }

    @Override
    public JShopper recoverFromOutputStream(ByteArrayOutputStream stream) {
        return this;
    }
}
