package Models;

public class Plataformas {
	private boolean windows;
	private boolean mac;
	private boolean linux;
	
	public boolean isWindows() {
		return windows;
	}
	public void setWindows(boolean windows) {
		this.windows = windows;
	}
	public boolean isMac() {
		return mac;
	}
	public void setMac(boolean mac) {
		this.mac = mac;
	}
	public boolean isLinux() {
		return linux;
	}
	public void setLinux(boolean linux) {
		this.linux = linux;
	}
}
