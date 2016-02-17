package io.opensemantics.semiotics.search.eclipse.internal;

import java.util.List;

import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchPattern;

import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearch;
import io.opensemantics.semiotics.search.eclipse.LimitToFineGrain;
import io.opensemantics.semiotics.search.eclipse.MatchFlag;

public class SearchPatternAdapter {

  public SearchPatternAdapter() {
    // TODO Auto-generated constructor stub
  }

  /*
   * @see org.eclipse.jdt.core.search.SearchPattern.createPattern
   */
  public static SearchPattern toPattern(EclipseJavaSearch search) {
    return SearchPattern.createPattern(search.getDescription(), toSearchFor(search), toLimitTo(search),
        toMatchRule(search));
  }

  private static int toSearchFor(EclipseJavaSearch search) {
    switch (search.getSearchFor()) {
    case ANNOTATION_TYPE:
      return IJavaSearchConstants.ANNOTATION_TYPE;
    case CLASS:
      return IJavaSearchConstants.CLASS;
    case CLASS_AND_ENUM:
      return IJavaSearchConstants.CLASS_AND_ENUM;
    case CLASS_AND_INTERFACE:
      return IJavaSearchConstants.CLASS_AND_INTERFACE;
    case CONSTRUCTOR:
      return IJavaSearchConstants.CONSTRUCTOR;
    case ENUM:
      return IJavaSearchConstants.ENUM;
    case FIELD:
      return IJavaSearchConstants.FIELD;
    case INTERFACE:
      return IJavaSearchConstants.INTERFACE;
    case METHOD:
      return IJavaSearchConstants.METHOD;
    case PACKAGE:
      return IJavaSearchConstants.PACKAGE;
    case TYPE:
      return IJavaSearchConstants.TYPE;
    case UNSET:
      throw new NullPointerException("Value cannot be unset");
    default:
      throw new UnsupportedOperationException("Value not implemented yet: " + search.getSearchFor());
    }
  }

  private static int toLimitTo(EclipseJavaSearch search) {
    int result;
    switch (search.getLimitTo()) {
    case ALL_OCCURRENCES:
      result = IJavaSearchConstants.ALL_OCCURRENCES;
      break;
    case DECLARATIONS:
      result = IJavaSearchConstants.DECLARATIONS;
      break;
    case IMPLEMENTORS:
      result = IJavaSearchConstants.IMPLEMENTORS;
      break;
    case REFERENCES:
      result = IJavaSearchConstants.REFERENCES;
      break;
    default:
      throw new UnsupportedOperationException("Value not implemented yet: " + search.getLimitTo());
    }
    return result | toFineGrainMask(search.getLimitToFineGrains());
  }

  private static int toFineGrainMask(List<LimitToFineGrain> fineGrains) {
    int mask = 0;
    for (LimitToFineGrain grain : fineGrains) {
      switch (grain) {
      case ANNOTATION_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.ANNOTATION_TYPE_REFERENCE;
        continue;
      case CAST_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.CAST_TYPE_REFERENCE;
        continue;
      case CATCH_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.CATCH_TYPE_REFERENCE;
        continue;
      case CLASS_INSTANCE_CREATION_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.CLASS_INSTANCE_CREATION_TYPE_REFERENCE;
        continue;
      case FIELD_DECLARATION_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.FIELD_DECLARATION_TYPE_REFERENCE;
        continue;
      case IMPLICIT_THIS_REFERENCE:
        mask |= IJavaSearchConstants.IMPLICIT_THIS_REFERENCE;
        continue;
      case IMPORT_DECLARATION_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.IMPORT_DECLARATION_TYPE_REFERENCE;
        continue;
      case INSTANCEOF_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.INSTANCEOF_TYPE_REFERENCE;
        continue;
      case LOCAL_VARIABLE_DECLARATION_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.LOCAL_VARIABLE_DECLARATION_TYPE_REFERENCE;
        continue;
      case METHOD_REFERENCE_EXPRESSION:
        mask |= IJavaSearchConstants.METHOD_REFERENCE_EXPRESSION;
        continue;
      case PARAMETER_DECLARATION_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.PARAMETER_DECLARATION_TYPE_REFERENCE;
        continue;
      case QUALIFIED_REFERENCE:
        mask |= IJavaSearchConstants.QUALIFIED_REFERENCE;
        continue;
      case RETURN_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.RETURN_TYPE_REFERENCE;
        continue;
      case SUPERTYPE_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.SUPERTYPE_TYPE_REFERENCE;
        continue;
      case SUPER_REFERENCE:
        mask |= IJavaSearchConstants.SUPER_REFERENCE;
        continue;
      case THIS_REFERENCE:
        mask |= IJavaSearchConstants.THIS_REFERENCE;
        continue;
      case THROWS_CLAUSE_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.THROWS_CLAUSE_TYPE_REFERENCE;
        continue;
      case TYPE_ARGUMENT_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.TYPE_ARGUMENT_TYPE_REFERENCE;
        continue;
      case TYPE_VARIABLE_BOUND_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.TYPE_VARIABLE_BOUND_TYPE_REFERENCE;
        continue;
      case WILDCARD_BOUND_TYPE_REFERENCE:
        mask |= IJavaSearchConstants.WILDCARD_BOUND_TYPE_REFERENCE;
        continue;
      case UNSET:
        continue;
      default:
        throw new UnsupportedOperationException("Value not implemented yet: " + grain);
      }
    }
    return mask;
  }

  private static int toMatchRule(EclipseJavaSearch search) {
    int result;
    switch (search.getMatchRule()) {
    case CAMELCASE:
      result = SearchPattern.R_CAMELCASE_MATCH;
      break;
    case CAMELCASE_SAME_PART_COUNT:
      result = SearchPattern.R_CAMELCASE_SAME_PART_COUNT_MATCH;
      break;
    case EXACT:
      result = SearchPattern.R_EXACT_MATCH;
      break;
    case PATTERN:
      result = SearchPattern.R_PATTERN_MATCH;
      break;
    case PREFIX:
      result = SearchPattern.R_PREFIX_MATCH;
      break;
    case REGEX:
      result = SearchPattern.R_REGEXP_MATCH;
      break;
    default:
      throw new UnsupportedOperationException("Value not implemented yet: " + search.getMatchRule());
    }
    return result | toMatchFlag(search.getMatchFlag());
  }

  private static int toMatchFlag(MatchFlag matchFlag) {
    switch (matchFlag) {
    case CASE_SENSITIVE:
      return SearchPattern.R_CASE_SENSITIVE;
    case EQUIVALENT:
      return SearchPattern.R_EQUIVALENT_MATCH;
    case ERASURE:
      return SearchPattern.R_ERASURE_MATCH;
    case UNSET:
      return 0;
    default:
      throw new UnsupportedOperationException("Value not implemented yet: " + matchFlag);
    }
  }
}
