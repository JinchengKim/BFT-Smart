package bftsmart.demo.delivery;

import java.io.ByteArrayOutputStream;

/**
 * Created by lijin on 2/23/19.
 */
public class JSerializable {
    public ByteArrayOutputStream generateOutputStream(){
        return new ByteArrayOutputStream();
    };

    public JSerializable recoverFromOutputStream(ByteArrayOutputStream stream){
        return this;
    }
}
