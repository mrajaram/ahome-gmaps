/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.gmaps.client.layers;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class KmlAuthor extends JsObject {

    public KmlAuthor() {
        jsObj = JsoHelper.createObject();
    }

    protected KmlAuthor(JavaScriptObject obj) {
        jsObj = obj;
    }

    public void setEmail(String value) {
        JsoHelper.setAttribute(jsObj, "email", value);
    }

    public void setName(String value) {
        JsoHelper.setAttribute(jsObj, "name", value);
    }

    public void setUri(String value) {
        JsoHelper.setAttribute(jsObj, "uri", value);
    }

}
