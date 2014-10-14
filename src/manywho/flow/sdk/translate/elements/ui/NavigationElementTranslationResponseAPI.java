package manywho.flow.sdk.translate.elements.ui;

import manywho.flow.sdk.translate.elements.*;

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

public class NavigationElementTranslationResponseAPI extends ElementTranslationResponseAPI
{
	private static final long serialVersionUID = 1L;

	private String privatelabelContentValueId;
	public final String getLabelContentValueId()
	{
		return privatelabelContentValueId;
	}
	public final void setLabelContentValueId(String value)
	{
		privatelabelContentValueId = value;
	}

	private java.util.ArrayList<NavigationItemTranslationResponseAPI> privatenavigationItems;
	public final java.util.ArrayList<NavigationItemTranslationResponseAPI> getNavigationItems()
	{
		return privatenavigationItems;
	}
	public final void setNavigationItems(java.util.ArrayList<NavigationItemTranslationResponseAPI> value)
	{
		privatenavigationItems = value;
	}
}