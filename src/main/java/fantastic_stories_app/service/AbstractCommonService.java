package fantastic_stories_app.service;

import fantastic_stories_app.common.MsgSource;

public abstract class AbstractCommonService {
    protected MsgSource msgSource;

    public AbstractCommonService(MsgSource msgSource) {
        this.msgSource = msgSource;
    }
}
