package cn.hiczy.chatserver.handler;

import cn.hiczy.common.utils.JwtUtils;
import cn.hiczy.protobuf.MessageProto;
import cn.hiczy.protobuf.utils.ProtoMessageUtils;
import cn.hiczy.protobuf.utils.SessionUtils;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


/**
 * 认证处理器,每个连接进来都要首先经过这个处理器
 */
@Component
@ChannelHandler.Sharable
public class AuthHandler extends ChannelInboundHandlerAdapter {

//    ConcurrentHashMap<Channel, String> sessionMap = new ConcurrentHashMap<>();
//



    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        MessageProto.Message message = (MessageProto.Message) msg;

        //校验登陆
        if(message.getType().equals(MessageProto.Message.MessageType.AUTH_REQ)){
//            JwtUtils.parseJWT().
//            if (isAuthed(message.getJwt())) {
//                Long userId = JwtUtils.getUserId(message.getJwt());
//                SessionUtils.bindSession(userId,ctx.channel());
//                ctx.pipeline().remove(this);
//                super.channelRead(ctx, msg);
//                return;
//            }
        }
        //如果不是登陆请求拒绝访问
        MessageProto.Message authRsp = ProtoMessageUtils.createAuthRsp();
        ctx.writeAndFlush(authRsp);

    }


    /**
     * 与客户端建立连接时
     * @param ctx ctx
     * @throws Exception Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        //一上线就提示登陆
        //提示登陆
//        MessageProto.Message message = ProtoMessageUtils.buildAuthRsp();
//
//        ctx.writeAndFlush(message);
    }


    /**
     * 当客户端失去连接时
     * @param ctx ctx
     * @throws Exception Exception
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        //断开连接


        System.out.println("断开连接");
        super.channelInactive(ctx);
    }




}
