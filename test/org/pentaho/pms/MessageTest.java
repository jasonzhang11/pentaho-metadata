package org.pentaho.pms;

import org.pentaho.pms.messages.Messages;

import junit.framework.TestCase;

/**
 * Tests the MetaData version of the localices messages to ensure we are getting the 
 * properties / messages from the correct messages.properties file.
 *  
 * @author David Kincade
 */
public class MessageTest extends TestCase {
  public void testMessages() {
    // In the messages.propeties file, the following is defined:
    // MessagesTest.CODE_TEST_MESSAGE=Test Message
    String result = Messages.getString("MessagesTest.CODE_TEST_MESSAGE"); //$NON-NLS-1$
    assertEquals("Test Message", result); //$NON-NLS-1$
  }
}