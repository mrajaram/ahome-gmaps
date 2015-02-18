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
package com.ait.toolkit.gmaps.client.overlays;

public enum SymbolPath {

    BACKWARD_CLOSED_ARROW("BACKWARD_CLOSED_ARROW"), BACKWARD_OPEN_ARROW("BACKWARD_OPEN_ARROW"), CIRCLE("CIRCLE"), FORWARD_CLOSED_ARROW(
                    "FORWARD_CLOSED_ARROW"), FORMWARD_OPEN_ARROW("FORMWARD_OPEN_ARROW");

    private String value;

    public String getValue() {
        return value;
    }

    private SymbolPath(String id) {
        value = createPeer(id);
    }

    private static native String createPeer(String id) /*-{
		return $wnd.google.maps.SymbolPath[id];
    }-*/;

    public static native SymbolPath fromValue(String value) /*-{
		switch (value) {
		case 'BACKWARD_CLOSED_ARROW':
			return @com.ait.toolkit.gmaps.client.overlays.SymbolPath::BACKWARD_CLOSED_ARROW;

		case 'BACKWARD_OPEN_ARROW':
			return @com.ait.toolkit.gmaps.client.overlays.SymbolPath::BACKWARD_OPEN_ARROW;

		case 'CIRCLE':
			return @com.ait.toolkit.gmaps.client.overlays.SymbolPath::CIRCLE;

		case 'FORWARD_CLOSED_ARROW':
			return @com.ait.toolkit.gmaps.client.overlays.SymbolPath::FORWARD_CLOSED_ARROW;

		case 'FORMWARD_OPEN_ARROW':
			return @com.ait.toolkit.gmaps.client.overlays.SymbolPath::FORMWARD_OPEN_ARROW;
		}
    }-*/;

}
