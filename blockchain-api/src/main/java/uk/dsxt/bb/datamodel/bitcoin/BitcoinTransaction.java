/*
 ******************************************************************************
 * Blockchain benchmarking framework                                          *
 * Copyright (C) 2016 DSX Technologies Limited.                               *
 *                                                                            *
 * This program is free software: you can redistribute it and/or modify       *
 * it under the terms of the GNU General Public License as published by       *
 * the Free Software Foundation, either version 3 of the License, or          *
 * (at your option) any later version.                                        *
 *                                                                            *
 * This program is distributed in the hope that it will be useful,            *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.                       *
 * See the GNU General Public License for more details.                       *
 *                                                                            *
 * You should have received a copy of the GNU General Public License          *
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.      *
 *                                                                            *
 * Removal or modification of this copyright notice is prohibited.            *
 *                                                                            *
 ******************************************************************************
 */

package uk.dsxt.bb.datamodel.bitcoin;

import lombok.Data;
import uk.dsxt.bb.datamodel.blockchain.BlockchainTransaction;

import java.math.BigDecimal;

@Data
public class BitcoinTransaction implements BlockchainTransaction {
    private String txid;
    private String address;
    private BigDecimal amount;
    private boolean spendable;

    BitcoinTransaction(String txid) {
        this.txid = txid;
    }

    @Override
    public String getTxId() {
        return txid;
    }
}
