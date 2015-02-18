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
package com.ait.toolkit.gmaps.client.streetview;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.controls.PanControlOptions;
import com.ait.toolkit.gmaps.client.controls.ZoomControlOptions;

/**
 * Options defining the properties of a StreetViewPanorama object.
 * 
 */
public class StreetViewPanoramaOptions extends JsObject {

    public StreetViewPanoramaOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * The enabled/disabled state of the address control.
     * 
     * @param value
     */
    public native void setAddressControl(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addressControl = value;
    }-*/;

    public native void setAddressControlOptions(StreetViewAddressControlOptions options)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addressControlOptions = options.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * Enables/disables zoom on double click. Enabled by default.
     * 
     * @param value
     */
    public native void setDisableDoubleClickZoom(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.disableDoubleClickZoom = value;
    }-*/;

    /**
     * If true, the close button is displayed. Disabled by default.
     * 
     * @param value
     */
    public native void setEnableCloseButton(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.enableCloseButton = value;
    }-*/;

    /**
     * The enabled/disabled state of the links control.
     * 
     * @param value
     */
    public native void setLinksControl(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.linksControl = value;
    }-*/;

    /**
     * The enabled/disabled state of the pan control.
     * 
     * @param value
     */
    public native void setPanControl(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.panControl = value;
    }-*/;

    /**
     * The display options for the pan control.
     * 
     * @param options
     */
    public native void setPanControlOptions(PanControlOptions options)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		this.panControlOptions = options.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		;
    }-*/;

    /**
     * The panorama ID, which should be set when specifying a custom panorama.
     * 
     * @param value
     */
    public native void setPano(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pano = value;
    }-*/;

    /**
     * The LatLng position of the Street View panorama.
     * 
     * @param value
     */
    public native void setPosition(LatLng value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.position = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		;
    }-*/;

    /**
     * The camera orientation, specified as heading, pitch, and zoom, for the
     * panorama.
     * 
     * @param value
     */
    public native void setPov(StreetViewPov value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pov = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * If false, disables scrollwheel zooming in Street View. The scrollwheel is
     * enabled by default.
     * 
     * @param value
     */
    public native void setScrollwWheel(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollwheel = value;
    }-*/;

    /**
     * If true, the Street View panorama is visible on load.
     * 
     * @param value
     */
    public native void setVisible(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.visible = value;
    }-*/;

    /**
     * The enabled/disabled state of the zoom control.
     * 
     * @param value
     */
    public native void setZoomControl(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.zoomControl = value;
    }-*/;

    /**
     * The display options for the zoom control.
     * 
     * @param options
     */
    public native void setZoomControlOptions(ZoomControlOptions options)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.zoomControlOptions = options.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

}
