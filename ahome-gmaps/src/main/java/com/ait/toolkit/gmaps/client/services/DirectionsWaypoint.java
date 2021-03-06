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
package com.ait.toolkit.gmaps.client.services;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A DirectionsWaypoint represents a location between origin and destination
 * through which the trip should be routed
 * 
 * @author Ekambi
 * 
 */
public class DirectionsWaypoint extends JsObject {

    public DirectionsWaypoint() {
        jsObj = JsoHelper.createObject();
    }

    public DirectionsWaypoint(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Waypoint location. Can be an address string or LatLng. Optional.
     * 
     * @param value
     */
    public final native void setLocation(LatLng value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.location = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * Waypoint location. Can be an address string or LatLng. Optional.
     * 
     * @param value
     */
    public final native void setLocation(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.location = value;
    }-*/;

    public final native LatLng getLocation()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.ait.toolkit.gmaps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * If true, indicates that this waypoint is a stop between the origin and
     * destination. This has the effect of splitting the route into two. This
     * value is true by default. Optional.
     * 
     * @param value
     */
    public final native void setStopOver(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.stopover = value;
    }-*/;

    public final native boolean isStopOver()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stopover;
    }-*/;

}
