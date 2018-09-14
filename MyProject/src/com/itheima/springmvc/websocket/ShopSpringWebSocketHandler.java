package com.itheima.springmvc.websocket;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


public class ShopSpringWebSocketHandler extends TextWebSocketHandler {
    private static final ArrayList<WebSocketSession> shops;//这个会出现性能问题，最好用Map来存储，key用userid
    private static Logger logger = Logger.getLogger(ShopSpringWebSocketHandler.class);
    static {
        shops = new ArrayList<WebSocketSession>();
    }
    
    public ShopSpringWebSocketHandler() {
        // TODO Auto-generated constructor stub
    }

    /**
     * 连接成功时候，会触发页面上onopen方法
     */
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("shop connect to the websocket success......");
        shops.add(session);
        //这块会实现自己业务，比如，当用户登录后，会把离线消息推送给用户
       for(int i=1;i<=10;i++)
       {
    	   TextMessage returnMessage = new TextMessage("shopsb"+i);
           session.sendMessage(returnMessage);
       }
    }
    
    /**
     * 关闭连接时触发
     */
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        logger.debug("shop websocket connection closed......");
        String username= (String) session.getAttributes().get("WEBSOCKET_USERNAME");
        System.out.println("商家"+username+"已退出！");
        shops.remove(session);
    }

    /**
     * js调用websocket.send时候，会调用该方法
     */
    @Override    
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
    }

    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        if(session.isOpen()){session.close();}
        logger.debug("shop websocket connection closed......");
        shops.remove(session);
    }

    public boolean supportsPartialMessages() {
        return false;
    }
    
    
    /**
     * 给某个用户发送消息
     *
     * @param userName
     * @param message
     */
    public void sendMessageToShop(String shopName, TextMessage message) {
        for (WebSocketSession shop : shops) {
            if (shop.getAttributes().get("WEBSOCKET_USERNAME").equals(shopName)) {
                try {
                    if (shop.isOpen()) {
                        shop.sendMessage(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
    
    /**
     * 给所有在线用户发送消息
     *
     * @param message
     */
    public void sendMessageToShops(TextMessage message) {
        for (WebSocketSession shop : shops) {
            try {
                if (shop.isOpen()) {
                    shop.sendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}