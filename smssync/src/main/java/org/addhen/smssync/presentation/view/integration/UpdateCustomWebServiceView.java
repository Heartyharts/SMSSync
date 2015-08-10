/*
 * Copyright (c) 2010 - 2015 Ushahidi Inc
 * All rights reserved
 * Contact: team@ushahidi.com
 * Website: http://www.ushahidi.com
 * GNU Lesser General Public License Usage
 * This file may be used under the terms of the GNU Lesser
 * General Public License version 3 as published by the Free Software
 * Foundation and appearing in the file LICENSE.LGPL included in the
 * packaging of this file. Please review the following information to
 * ensure the GNU Lesser General Public License version 3 requirements
 * will be met: http://www.gnu.org/licenses/lgpl.html.
 *
 * If you have questions regarding the use of this file, please contact
 * Ushahidi developers at team@ushahidi.com.
 */

package org.addhen.smssync.presentation.view.integration;

import com.addhen.android.raiburari.presentation.ui.view.LoadDataView;
import com.ushahidi.android.presentation.model.CustomWebServiceModel;

/**
 * Update deployment View
 *
 * @author Ushahidi Team <team@ushahidi.com>
 */
public interface UpdateCustomWebServiceView extends LoadDataView {

    /**
     * Shows when a deployment has been successfully updated
     *
     * @param row The affacted row
     */
    void onCustomWebServiceSuccessfullyUpdated(Long row);

    /**
     * Renders a {@link CustomWebServiceModel}
     *
     * @param deploymentModel The deployment model to be rendered
     */
    void showCustomWebService(CustomWebServiceModel deploymentModel);
}
