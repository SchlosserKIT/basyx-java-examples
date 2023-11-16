/*******************************************************************************
 * Copyright (C) 2023 the Eclipse BaSyx Authors
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT
 ******************************************************************************/

package trajectory_msgs;

import geometry_msgs.Transform;
import geometry_msgs.Twist;
import java_rosbridge_client.core.utility.RosMessage;
import msg_elements.Duration;

public class MultiDOFJointTrajectoryPoint extends RosMessage{
	
	private Transform[] transforms;
	private Twist[] velocities;
	private Twist[] accelerations;
	private Duration time_from_start;
	
	public MultiDOFJointTrajectoryPoint() {
		
	}
	
	public MultiDOFJointTrajectoryPoint(Transform[] transforms, Twist[] velocities, Twist[] accelerations, Duration time_from_start) {
		this.setTransforms(transforms);
		this.setVelocities(velocities);
		this.setAccelerations(accelerations);
		this.setTime_from_start(time_from_start);
	}

	public Transform[] getTransforms() {
		return transforms;
	}

	public void setTransforms(Transform[] transforms) {
		this.transforms = transforms;
	}

	public Twist[] getVelocities() {
		return velocities;
	}

	public void setVelocities(Twist[] velocities) {
		this.velocities = velocities;
	}

	public Twist[] getAccelerations() {
		return accelerations;
	}

	public void setAccelerations(Twist[] accelerations) {
		this.accelerations = accelerations;
	}

	public Duration getTime_from_start() {
		return time_from_start;
	}

	public void setTime_from_start(Duration time_from_start) {
		this.time_from_start = time_from_start;
	}

}