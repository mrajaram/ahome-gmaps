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
package com.ait.toolkit.gmaps.client.controls;

public enum ZoomControlStyle {

  DEFAULT("DEFAULT"), LARGE("LARGE"), SMALL("SMALL");

  private String value;

  public String getValue() {
    return value;
  }

  private ZoomControlStyle(String style) {
    value = createPeer(style);
  }

  private static native String createPeer(String style) /*-{
		return $wnd.google.maps.ZoomControlStyle[style];
  }-*/;

  public static native ZoomControlStyle fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.ZoomControlStyle.DEFAULT:
			return @com.ait.toolkit.gmaps.client.controls.ZoomControlStyle::DEFAULT;

		case $wnd.google.maps.ZoomControlStyle.LARGE:
			return @com.ait.toolkit.gmaps.client.controls.ZoomControlStyle::LARGE;

		case $wnd.google.maps.ZoomControlStyle.SMALL:
			return @com.ait.toolkit.gmaps.client.controls.ZoomControlStyle::SMALL;
		}
  }-*/;

}
