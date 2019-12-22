package fantastic_stories_app.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MsgSource {
    public final String OK001;
    public final String OK002;
    public final String OK003;

    public final ConstErrorMsg ERR001;
    public final ConstErrorMsg ERR002;
    public final ConstErrorMsg ERR003;
    public final ConstErrorMsg ERR004;
    public final ConstErrorMsg ERR005;
    public final ConstErrorMsg ERR006;
    public final ConstErrorMsg ERR007;
    public final ConstErrorMsg ERR008;
    public final ConstErrorMsg ERR009;
    public final ConstErrorMsg ERR010;
    public final ConstErrorMsg ERR011;

    public MsgSource(
            @Value("${common.ok.msg.ok001}") String ok001MsgValue,
            @Value("${common.ok.msg.ok002}") String ok002MsgValue,
            @Value("${common.ok.msg.ok003}") String ok003MsgValue,

            @Value("${common.const.error.msg.err001}") String err001MsgValue,
            @Value("${common.const.error.msg.err002}") String err002MsgValue,
            @Value("${common.const.error.msg.err003}") String err003MsgValue,
            @Value("${common.const.error.msg.err004}") String err004MsgValue,
            @Value("${common.const.error.msg.err005}") String err005MsgValue,
            @Value("${common.const.error.msg.err006}") String err006MsgValue,
            @Value("${common.const.error.msg.err007}") String err007MsgValue,
            @Value("${common.const.error.msg.err008}") String err008MsgValue,
            @Value("${common.const.error.msg.err009}") String err009MsgValue,
            @Value("${common.const.error.msg.err010}") String err010MsgValue,
            @Value("${common.const.error.msg.err011}") String err011MsgValue)
    {
        this.OK001 = ok001MsgValue;
        this.OK002 = ok002MsgValue;
        this.OK003 = ok003MsgValue;
        this.ERR001 = new ConstErrorMsg("ERR001", err001MsgValue);
        this.ERR002 = new ConstErrorMsg("ERR002", err002MsgValue);
        this.ERR003 = new ConstErrorMsg("ERR003", err003MsgValue);
        this.ERR004 = new ConstErrorMsg("ERR004", err004MsgValue);
        this.ERR005 = new ConstErrorMsg("ERR005", err005MsgValue);
        this.ERR006 = new ConstErrorMsg("ERR006", err006MsgValue);
        this.ERR007 = new ConstErrorMsg("ERR007", err007MsgValue);
        this.ERR008 = new ConstErrorMsg("ERR008", err008MsgValue);
        this.ERR009 = new ConstErrorMsg("ERR009", err009MsgValue);
        this.ERR010 = new ConstErrorMsg("ERR010", err010MsgValue);
        this.ERR011 = new ConstErrorMsg("ERR011", err011MsgValue);
    }
}
