/*
 * generated by Xtext 2.26.0
 */
package org.zumi.xtext.gbasm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.zumi.xtext.gbasm.ide.contentassist.antlr.internal.InternalGbasmParser;
import org.zumi.xtext.gbasm.services.GbasmGrammarAccess;

public class GbasmParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GbasmGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GbasmGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getRegister8Access().getAlternatives(), "rule__Register8__Alternatives");
			builder.put(grammarAccess.getRegister16Access().getAlternatives(), "rule__Register16__Alternatives");
			builder.put(grammarAccess.getLabelOrConstantAccess().getAlternatives_1(), "rule__LabelOrConstant__Alternatives_1");
			builder.put(grammarAccess.getLabelOrConstantAccess().getAlternatives_1_1_0(), "rule__LabelOrConstant__Alternatives_1_1_0");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getInstructionAccess().getAlternatives_1(), "rule__Instruction__Alternatives_1");
			builder.put(grammarAccess.getReptAccess().getAlternatives(), "rule__Rept__Alternatives");
			builder.put(grammarAccess.getRotateAAccess().getAlternatives(), "rule__RotateA__Alternatives");
			builder.put(grammarAccess.getBitOpsAccess().getAlternatives_0(), "rule__BitOps__Alternatives_0");
			builder.put(grammarAccess.getBitOpsAccess().getAlternatives_3(), "rule__BitOps__Alternatives_3");
			builder.put(grammarAccess.getSwapAccess().getAlternatives_1(), "rule__Swap__Alternatives_1");
			builder.put(grammarAccess.getIncDecAccess().getAlternatives_0(), "rule__IncDec__Alternatives_0");
			builder.put(grammarAccess.getIncDecAccess().getAlternatives_1(), "rule__IncDec__Alternatives_1");
			builder.put(grammarAccess.getLdAccess().getAlternatives_1(), "rule__Ld__Alternatives_1");
			builder.put(grammarAccess.getLdAccess().getAlternatives_1_4_2(), "rule__Ld__Alternatives_1_4_2");
			builder.put(grammarAccess.getLdHl1Access().getAlternatives_1(), "rule__LdHl1__Alternatives_1");
			builder.put(grammarAccess.getLdHl1Access().getAlternatives_2(), "rule__LdHl1__Alternatives_2");
			builder.put(grammarAccess.getExprAccess().getAlternatives(), "rule__Expr__Alternatives");
			builder.put(grammarAccess.getLabelReferenceAccess().getAlternatives_1_0(), "rule__LabelReference__Alternatives_1_0");
			builder.put(grammarAccess.getPushPopAccess().getAlternatives_0(), "rule__PushPop__Alternatives_0");
			builder.put(grammarAccess.getAndCpAccess().getAlternatives_0(), "rule__AndCp__Alternatives_0");
			builder.put(grammarAccess.getAndCpAccess().getAlternatives_2(), "rule__AndCp__Alternatives_2");
			builder.put(grammarAccess.getRetAccess().getAlternatives_1(), "rule__Ret__Alternatives_1");
			builder.put(grammarAccess.getCallOrJumpAccess().getAlternatives_0(), "rule__CallOrJump__Alternatives_0");
			builder.put(grammarAccess.getCallOrJumpAccess().getAlternatives_1_0(), "rule__CallOrJump__Alternatives_1_0");
			builder.put(grammarAccess.getCallOrJumpAccess().getAlternatives_2(), "rule__CallOrJump__Alternatives_2");
			builder.put(grammarAccess.getLabelOrConstantAccess().getGroup(), "rule__LabelOrConstant__Group__0");
			builder.put(grammarAccess.getLabelOrConstantAccess().getGroup_1_0(), "rule__LabelOrConstant__Group_1_0__0");
			builder.put(grammarAccess.getLabelOrConstantAccess().getGroup_1_1(), "rule__LabelOrConstant__Group_1_1__0");
			builder.put(grammarAccess.getLocalLabelAccess().getGroup(), "rule__LocalLabel__Group__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup(), "rule__Instruction__Group__0");
			builder.put(grammarAccess.getReptAccess().getGroup_0(), "rule__Rept__Group_0__0");
			builder.put(grammarAccess.getBitOpsAccess().getGroup(), "rule__BitOps__Group__0");
			builder.put(grammarAccess.getBitOpsAccess().getGroup_3_1(), "rule__BitOps__Group_3_1__0");
			builder.put(grammarAccess.getAddHlAccess().getGroup(), "rule__AddHl__Group__0");
			builder.put(grammarAccess.getSwapAccess().getGroup(), "rule__Swap__Group__0");
			builder.put(grammarAccess.getSwapAccess().getGroup_1_1(), "rule__Swap__Group_1_1__0");
			builder.put(grammarAccess.getIncDecAccess().getGroup(), "rule__IncDec__Group__0");
			builder.put(grammarAccess.getIncDecAccess().getGroup_1_2(), "rule__IncDec__Group_1_2__0");
			builder.put(grammarAccess.getLdAccess().getGroup(), "rule__Ld__Group__0");
			builder.put(grammarAccess.getLdAccess().getGroup_1_0(), "rule__Ld__Group_1_0__0");
			builder.put(grammarAccess.getLdAccess().getGroup_1_1(), "rule__Ld__Group_1_1__0");
			builder.put(grammarAccess.getLdAccess().getGroup_1_2(), "rule__Ld__Group_1_2__0");
			builder.put(grammarAccess.getLdAccess().getGroup_1_3(), "rule__Ld__Group_1_3__0");
			builder.put(grammarAccess.getLdAccess().getGroup_1_4(), "rule__Ld__Group_1_4__0");
			builder.put(grammarAccess.getLdAccess().getGroup_1_4_2_1(), "rule__Ld__Group_1_4_2_1__0");
			builder.put(grammarAccess.getLdAccess().getGroup_1_5(), "rule__Ld__Group_1_5__0");
			builder.put(grammarAccess.getLdAccess().getGroup_1_6(), "rule__Ld__Group_1_6__0");
			builder.put(grammarAccess.getLdHl1Access().getGroup(), "rule__LdHl1__Group__0");
			builder.put(grammarAccess.getLdHl1Access().getGroup_2_0(), "rule__LdHl1__Group_2_0__0");
			builder.put(grammarAccess.getLdHl1Access().getGroup_2_1(), "rule__LdHl1__Group_2_1__0");
			builder.put(grammarAccess.getLabelReferenceAccess().getGroup(), "rule__LabelReference__Group__0");
			builder.put(grammarAccess.getLabelReferenceAccess().getGroup_1(), "rule__LabelReference__Group_1__0");
			builder.put(grammarAccess.getBankReferenceAccess().getGroup(), "rule__BankReference__Group__0");
			builder.put(grammarAccess.getPushPopAccess().getGroup(), "rule__PushPop__Group__0");
			builder.put(grammarAccess.getAndCpAccess().getGroup(), "rule__AndCp__Group__0");
			builder.put(grammarAccess.getAndCpAccess().getGroup_1(), "rule__AndCp__Group_1__0");
			builder.put(grammarAccess.getRetAccess().getGroup(), "rule__Ret__Group__0");
			builder.put(grammarAccess.getCallOrJumpAccess().getGroup(), "rule__CallOrJump__Group__0");
			builder.put(grammarAccess.getCallOrJumpAccess().getGroup_1(), "rule__CallOrJump__Group_1__0");
			builder.put(grammarAccess.getCallOrJumpAccess().getGroup_2_1(), "rule__CallOrJump__Group_2_1__0");
			builder.put(grammarAccess.getAsmAccess().getLabelsAssignment(), "rule__Asm__LabelsAssignment");
			builder.put(grammarAccess.getLabelOrConstantAccess().getNameAssignment_0(), "rule__LabelOrConstant__NameAssignment_0");
			builder.put(grammarAccess.getLabelOrConstantAccess().getStatementsAssignment_1_0_2(), "rule__LabelOrConstant__StatementsAssignment_1_0_2");
			builder.put(grammarAccess.getLocalLabelAccess().getNameAssignment_1(), "rule__LocalLabel__NameAssignment_1");
			builder.put(grammarAccess.getLdAccess().getLocLabelAssignment_1_4_2_1_1(), "rule__Ld__LocLabelAssignment_1_4_2_1_1");
			builder.put(grammarAccess.getLabelReferenceAccess().getRefLabelAssignment_0(), "rule__LabelReference__RefLabelAssignment_0");
			builder.put(grammarAccess.getBankReferenceAccess().getBankLabelAssignment_2(), "rule__BankReference__BankLabelAssignment_2");
			builder.put(grammarAccess.getAndCpAccess().getAndCpLabelRefAssignment_2_1(), "rule__AndCp__AndCpLabelRefAssignment_2_1");
			builder.put(grammarAccess.getCallOrJumpAccess().getAbsLabelAssignment_2_0(), "rule__CallOrJump__AbsLabelAssignment_2_0");
			builder.put(grammarAccess.getCallOrJumpAccess().getLocLabelAssignment_2_1_1(), "rule__CallOrJump__LocLabelAssignment_2_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GbasmGrammarAccess grammarAccess;

	@Override
	protected InternalGbasmParser createParser() {
		InternalGbasmParser result = new InternalGbasmParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GbasmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GbasmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
