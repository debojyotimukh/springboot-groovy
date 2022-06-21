// A simple redirection server
@RestController
class SundownNotice {

	@RequestMapping("/*")
	String redirect() {
		return "<head><h1>Application Sundown!!</h1>redirecting...<meta http-equiv=\"Refresh\" content=\"5; URL=https://example.com/\"></head>"
	}

}