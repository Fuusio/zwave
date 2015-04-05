package com.oberasoftware.home.zwave.converter.actions.devices;

import com.oberasoftware.base.event.EventSubscribe;
import com.oberasoftware.home.zwave.api.actions.devices.RequestNodeInfoAction;
import com.oberasoftware.home.zwave.converter.ActionConverterBuilder;
import com.oberasoftware.home.zwave.converter.ZWaveConverter;
import com.oberasoftware.home.zwave.exceptions.HomeAutomationException;
import com.oberasoftware.home.zwave.messages.types.ControllerMessageType;
import com.oberasoftware.home.zwave.messages.types.MessageType;
import com.oberasoftware.home.zwave.threading.ActionConvertedEvent;
import org.springframework.stereotype.Component;

/**
 * @author renarj
 */
@Component
public class RequestNodeInfoConverter implements ZWaveConverter {

    @EventSubscribe
    public ActionConvertedEvent convert(RequestNodeInfoAction nodeInfoAction, int callbackId) throws HomeAutomationException {
        int nodeId = nodeInfoAction.getNodeId();

//        ZWaveRawMessage message = new ZWaveRawMessage(nodeId,
//                ControllerMessageType.RequestNodeInfo, MessageType.Request);
//
//        byte[] newPayload = { (byte) nodeId };
//        message.setMessage(newPayload);
//        return message;

        return ActionConverterBuilder.create(ControllerMessageType.RequestNodeInfo, MessageType.Request, nodeId).construct();
    }
}
