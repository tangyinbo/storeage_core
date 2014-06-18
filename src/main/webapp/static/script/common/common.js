(function($) {
	// 取出空格
	String.prototype.trim = function() {
		var reg = /(^\s+)|(\s+$)/g;
		return this.replace(reg, "");
	}
	
})(jQuery);