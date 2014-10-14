package manywho.flow.sdk.draw.elements.group;

import java.io.Serializable;

import org.json.JSONObject;

/*!

Copyright 2013 ManyWho, Inc.

Licensed under the ManyWho License, Version 1.0 (the "License"); you may not use this
file except in compliance with the License.

You may obtain a copy of the License at: http://manywho.com/sharedsource

Unless required by applicable law or agreed to in writing, software distributed under
the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied. See the License for the specific language governing
permissions and limitations under the License.

*/

public class GroupAuthorizationUserAPI extends JSONObject implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String privateauthenticationId;
	public final String getAuthenticationId()
	{
		return privateauthenticationId;
	}
	public final void setAuthenticationId(String value)
	{
		privateauthenticationId = value;
	}

	private String privateattribute;
	public final String getAttribute()
	{
		return privateattribute;
	}
	public final void setAttribute(String value)
	{
		privateattribute = value;
	}

	private boolean privaterunningUser;
	public final boolean getRunningUser()
	{
		return privaterunningUser;
	}
	public final void setRunningUser(boolean value)
	{
		privaterunningUser = value;
	}
}