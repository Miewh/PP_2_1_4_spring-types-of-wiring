package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private Needle7 needlel7;

    @Override
    public String toString() {

        return ", в яйце иголка " + needlel7.toString();
    }
    @Autowired
    public void setNeedlel7(Needle7 needlel7) {
        this.needlel7 = needlel7;
    }
}
