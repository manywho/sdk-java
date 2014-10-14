package manywho.flow.sdk.draw.elements.type;

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

public class TypeElementBindingAPI extends JSONObject implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String privateid;
	public final String getId()
	{
		return privateid;
	}
	public final void setId(String value)
	{
		privateid = value;
	}

	private String privatedeveloperName;
	public final String getDeveloperName()
	{
		return privatedeveloperName;
	}
	public final void setDeveloperName(String value)
	{
		privatedeveloperName = value;
	}

	private String privatedeveloperSummary;
	public final String getDeveloperSummary()
	{
		return privatedeveloperSummary;
	}
	public final void setDeveloperSummary(String value)
	{
		privatedeveloperSummary = value;
	}

	private String privatedatabaseTableName;
	public final String getDatabaseTableName()
	{
		return privatedatabaseTableName;
	}
	public final void setDatabaseTableName(String value)
	{
		privatedatabaseTableName = value;
	}

	private String privateserviceElementId;
	public final String getServiceElementId()
	{
		return privateserviceElementId;
	}
	public final void setServiceElementId(String value)
	{
		privateserviceElementId = value;
	}

	private java.util.ArrayList<TypeElementPropertyBindingAPI> privatepropertyBindings;
	public final java.util.ArrayList<TypeElementPropertyBindingAPI> getPropertyBindings()
	{
		return privatepropertyBindings;
	}
	public final void setPropertyBindings(java.util.ArrayList<TypeElementPropertyBindingAPI> value)
	{
		privatepropertyBindings = value;
	}
}