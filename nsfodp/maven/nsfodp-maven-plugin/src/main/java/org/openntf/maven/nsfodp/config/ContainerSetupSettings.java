/*
 * Copyright © 2018-2025 Adrian Osterwalder
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openntf.maven.nsfodp.config;

/**
 * Configurable settings for the one-touch setup of the Domino build container
 * 
 * @author Adrian Osterwalder
 * @since 4.1.0
 */
public class ContainerSetupSettings {

	private String serverName = "NSFODP";
	private String orgName = "OpenNTFBuild";

	private boolean useExistingServerID = false;
	private String serverIDFilePath = null;
	private String serverPassword = null;

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public boolean isUseExistingServerID() {
		return useExistingServerID;
	}

	public void setUseExistingServerID(boolean useExistingServerID) {
		this.useExistingServerID = useExistingServerID;
	}

	public String getServerIDFilePath() {
		return serverIDFilePath;
	}

	public void setServerIDFilePath(String serverIDFilePath) {
		this.serverIDFilePath = serverIDFilePath;
	}

	public String getServerPassword() {
		return serverPassword;
	}

	public void setServerPassword(String serverPassword) {
		this.serverPassword = serverPassword;
	}
	
}
