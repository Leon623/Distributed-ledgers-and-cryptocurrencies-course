package hr.fer.rgkk.transactions;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.script.Script;
import org.bitcoinj.script.ScriptBuilder;

import static org.bitcoinj.script.ScriptOpCodes.*;

public class LogicalEquivalenceTransaction extends ScriptTransaction {

    public LogicalEquivalenceTransaction(WalletKit walletKit, NetworkParameters parameters) {
        super(walletKit, parameters);
    }

    @Override
    public Script createLockingScript() {
        // TODO: Create Locking script
        throw new UnsupportedOperationException();
    }

    @Override
    public Script createUnlockingScript(Transaction unsignedScript) {
        long x = 1;
        long y = 1;
        return new ScriptBuilder()
                .number(x)
                .number(y)
                .build();
    }
}
