/*
 * generated by Xtext 2.26.0
 */
package org.zumi.xtext.gbasm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GbasmAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/zumi/xtext/gbasm/parser/antlr/internal/InternalGbasm.tokens");
	}
}