function creatCorsResquest(method, url) {
	var xhr = new XMLHttpRequest();
	if ("withCredentials" in xhr) {
		xhr.open(method, url);
	} else if (typeof XDomainRequest != "undefined") {
		xhr = new XDomainRequest();
	} else {
		xhr = null;
	}
	return xhr;
}
var url = "";
var xhr = creatCorsResquest("GET", url);
xhr.getResponseHeader(header);