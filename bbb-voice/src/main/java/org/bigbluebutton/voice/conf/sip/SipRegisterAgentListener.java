package org.bigbluebutton.voice.conf.sip;

public interface SipRegisterAgentListener {
    /** When a UA has been successfully (un)registered. */    
    public void onRegistrationSuccess(String result);
    /** When a UA failed on (un)registering. */
    public void onRegistrationFailure(String result);
	public void onUnregistedSuccess();
}
