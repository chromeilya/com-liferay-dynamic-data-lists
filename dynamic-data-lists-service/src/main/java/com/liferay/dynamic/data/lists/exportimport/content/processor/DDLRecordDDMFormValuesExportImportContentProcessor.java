/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.dynamic.data.lists.exportimport.content.processor;

import com.liferay.dynamic.data.lists.model.DDLRecord;
import com.liferay.dynamic.data.mapping.exportimport.content.processor.BaseDDMFormValuesExportImportContentProcessor;
import com.liferay.exportimport.content.processor.ExportImportContentProcessor;

import org.osgi.service.component.annotations.Component;

/**
 * @author Mate Thurzo
 */
@Component(
	property = {
		"model.class.name=com.liferay.dynamic.data.lists.model.DDLRecord"
	},
	service = {ExportImportContentProcessor.class}
)
public class DDLRecordDDMFormValuesExportImportContentProcessor
	extends BaseDDMFormValuesExportImportContentProcessor<DDLRecord> {
}