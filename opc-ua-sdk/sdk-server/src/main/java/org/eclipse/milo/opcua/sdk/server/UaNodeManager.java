/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.milo.opcua.sdk.server;

import org.eclipse.milo.opcua.sdk.server.api.AbstractNodeManager;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNode;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;

public class UaNodeManager extends AbstractNodeManager<UaNode> {

    /**
     * Create a {@link UaNodeManager}.
     *
     * @param namespaceTable the {@link NamespaceTable}.
     */
    public UaNodeManager(NamespaceTable namespaceTable) {
        super(namespaceTable);
    }

}
