
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.recording.Transcription
 */
@UriParams
@Configurer
public final class RecordingTranscriptionEndpointConfiguration extends TwilioConfiguration {

    @UriParam
    private String pathAccountSid;

    @UriParam
    private String pathRecordingSid;

    @UriParam
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathRecordingSid() {
        return pathRecordingSid;
    }

    public void setPathRecordingSid(String pathRecordingSid) {
        this.pathRecordingSid = pathRecordingSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}