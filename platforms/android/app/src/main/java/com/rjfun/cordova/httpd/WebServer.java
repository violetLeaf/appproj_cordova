package com.rjfun.cordova.httpd;

import java.io.IOException;
import java.net.InetSocketAddress;
import android.content.Context;

public class WebServer extends NanoHTTPD
{
	public WebServer(InetSocketAddress localAddr, AndroidFile wwwroot, Context context) throws IOException {
		super(localAddr, wwwroot, context);
	}

	public WebServer(int port, AndroidFile wwwroot, Context context) throws IOException {
		super(port, wwwroot, context);
	}
}
